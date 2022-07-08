package com.claimsmanagement.claimsmanagement.core.admin;

import com.claimsmanagement.claimsmanagement.core.claim.ClaimService;
import com.claimsmanagement.claimsmanagement.core.claim.web.ClaimView;
import com.claimsmanagement.claimsmanagement.core.member.MemberService;
import com.claimsmanagement.claimsmanagement.core.member.web.MemberView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    private ClaimService claimService;
    @Autowired
    private MemberService memberService;
    @Override
    public Page<ClaimView> getAllClaims(@PageableDefault(sort = "claimRaisedDate", direction = Sort.Direction.ASC)
                                            Pageable pageable) {
        return claimService.getAllClaims(pageable);
    }

    @Override
    public Page<MemberView> getAllMembers(@PageableDefault(sort = "memberId", direction = Sort.Direction.DESC)
                                              Pageable pageable) {
        return memberService.getAllMembers(pageable);
    }

    @Override
    public void processClaim() {
        // Logic for processing Claim
    }
}
